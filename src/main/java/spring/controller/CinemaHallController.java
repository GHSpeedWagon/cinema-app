package spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.dto.request.CinemaHallRequestDto;
import spring.dto.response.CinemaHallResponseDto;
import spring.model.CinemaHall;
import spring.service.CinemaHallService;
import spring.service.mapper.RequestDtoMapper;
import spring.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;
    private final RequestDtoMapper<CinemaHallRequestDto, CinemaHall> cinemaHallRequestDtoMapper;
    private final ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> cinemaHallResponseDtoMapper;

    public CinemaHallController(CinemaHallService cinemaHallService,
            RequestDtoMapper<CinemaHallRequestDto, CinemaHall> cinemaHallRequestDtoMapper,
            ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> cinemaHallResponseDtoMapper) {
        this.cinemaHallService = cinemaHallService;
        this.cinemaHallRequestDtoMapper = cinemaHallRequestDtoMapper;
        this.cinemaHallResponseDtoMapper = cinemaHallResponseDtoMapper;
    }

    @PostMapping
    public CinemaHallResponseDto add(@RequestBody @Valid CinemaHallRequestDto requestDto) {
        CinemaHall cinemaHall = cinemaHallService.add(
                cinemaHallRequestDtoMapper.mapToModel(requestDto));
        return cinemaHallResponseDtoMapper.mapToDto(cinemaHall);
    }

    @GetMapping
    public List<CinemaHallResponseDto> getAll() {
        return cinemaHallService.getAll()
                .stream()
                .map(cinemaHallResponseDtoMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
