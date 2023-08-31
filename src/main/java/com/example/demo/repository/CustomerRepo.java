package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
      
	 @Query(value="select * from Customer where id=:s",nativeQuery=true)
	   public List<Customer> getcustbyid(@Param("s") int id);
	 
	 @Query(value="select * from Customer where id=:yr or name=:name",nativeQuery=true)
	   public List<Customer> getcustbyParam(@Param("yr") int id, @Param("name") String name );
	 
	 @Modifying
	 @Transactional
	 @Query(value="delete from Customer  where id=:s1",nativeQuery=true)
	   public Integer deletecust(@Param("s1") int id );
	 
	 
	 @Modifying
	 @Transactional
	 @Query(value="update Count c set c.dquantity=:s  where c.countid=:s1",nativeQuery=true)
	   public Integer updatecustdq(@Param("s") int dquantity, @Param("s1") int countid );
	 
	 @Modifying
	 @Transactional
	 @Query(value="update Count c set c.squantity=:s  where c.countid=:s1",nativeQuery=true)
	   public Integer updatecustsq(@Param("s") int squantity, @Param("s1") int countid );
	 
	 @Modifying
	 @Transactional
	 @Query(value="update Count c set c.mquantity=:s  where c.countid=:s1",nativeQuery=true)
	   public Integer updatecustmq(@Param("s") int mquantity, @Param("s1") int countid );
	 
	 @Modifying
	 @Transactional
	 @Query(value="update Customer  set name=:s  where id=:s1",nativeQuery=true)
	   public Integer updatecustname(@Param("s") String s , @Param("s1") int s1);
}
  