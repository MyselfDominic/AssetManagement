package Asset.Managment.Asset.repository;

import Asset.Managment.Asset.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface Staffrepository extends JpaRepository<Staff , Long> {

    List<Staff> findByEmail(String email);

    @Query(value="select * from staff where staff.email= :email", nativeQuery=true)
    public List<Staff> myquery(String email);


    List<Staff> findByMobile(String email);

}