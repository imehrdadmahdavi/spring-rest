package sh.mehrdad.springrest.repository;

import sh.mehrdad.springrest.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Spring implements this class on the fly!
public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.id, d.name from Dog d")
    List<String> findAllName();
}
