package sh.mehrdad.springrest.service;

import sh.mehrdad.springrest.entity.Dog;
import sh.mehrdad.springrest.repository.DogRepository;
import sh.mehrdad.springrest.exception.DogNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {


    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        return optionalBreed.orElseThrow(DogNotFoundException::new);
    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}