package spring.service.mapper;

import org.springframework.stereotype.Component;
import spring.dto.request.MovieSessionRequestDto;
import spring.dto.response.MovieSessionResponseDto;
import spring.model.MovieSession;
import spring.service.CinemaHallService;
import spring.service.MovieService;

@Component
public class MovieSessionMapper implements RequestDtoMapper<MovieSessionRequestDto, MovieSession>,
        ResponseDtoMapper<MovieSessionResponseDto, MovieSession> {
    private final CinemaHallService cinemaHallService;
    private final MovieService movieService;

    public MovieSessionMapper(CinemaHallService cinemaHallService, MovieService movieService) {
        this.cinemaHallService = cinemaHallService;
        this.movieService = movieService;
    }

    @Override
    public MovieSession mapToModel(MovieSessionRequestDto dto) {
        MovieSession movieSession = new MovieSession();
        movieSession.setMovie(movieService.get(dto.getMovieId()));
        movieSession.setCinemaHall(cinemaHallService.get(dto.getCinemaHallId()));
        movieSession.setShowTime(dto.getShowTime());
        return movieSession;
    }

    @Override
    public MovieSessionResponseDto mapToDto(MovieSession movieSession) {
        MovieSessionResponseDto responseDto = new MovieSessionResponseDto();
        responseDto.setMovieSessionId(movieSession.getId());
        responseDto.setCinemaHallId(movieSession.getCinemaHall().getId());
        responseDto.setMovieId(movieSession.getMovie().getId());
        responseDto.setMovieTitle(movieSession.getMovie().getTitle());
        responseDto.setShowTime(movieSession.getShowTime());
        return responseDto;
    }
}
