//package net.spring.crs;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import com.Model.People;
//import com.Repo.PeopleRepository;
//
//@SpringBootTest
//class TitanicApplicationTests {
//
//	@Test
//	void contextLoads() {
//
//		// Given
//		PeopleRepository peopleRepository = new PeopleRepository() {
//
//			@Override
//			public <S extends People> Optional<S> findOne(Example<S> example) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> Page<S> findAll(Example<S> example, Pageable pageable) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> boolean exists(Example<S> example) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public <S extends People> long count(Example<S> example) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public <S extends People> S save(S entity) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public Optional<People> findById(Long id) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public boolean existsById(Long id) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//
//			@Override
//			public void deleteById(Long id) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void deleteAllById(Iterable<? extends Long> ids) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void deleteAll(Iterable<? extends People> entities) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void deleteAll() {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void delete(People entity) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public long count() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public Page<People> findAll(Pageable pageable) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> S saveAndFlush(S entity) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> List<S> saveAllAndFlush(Iterable<S> entities) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> List<S> saveAll(Iterable<S> entities) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public People getOne(Long id) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public People getById(Long id) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void flush() {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public List<People> findAllById(Iterable<Long> ids) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> List<S> findAll(Example<S> example, Sort sort) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public <S extends People> List<S> findAll(Example<S> example) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public List<People> findAll(Sort sort) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public List<People> findAll() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void deleteAllInBatch(Iterable<People> entities) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void deleteAllInBatch() {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void deleteAllByIdInBatch(Iterable<Long> ids) {
//				// TODO Auto-generated method stub
//
//			}
//		};
//
//		// When
//		peopleRepository.count();
//		assertEquals(peopleRepository, peopleRepository);
//
//	}
//
//}
