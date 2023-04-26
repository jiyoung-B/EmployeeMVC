package project.spring4.mvc.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import project.spring4.mvc.employee.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("empdao")
public class EmployeeDAOImpl implements EmployeeDAO {
    @Value("#{jdbc['selectSQL']}") private String selectSQL;
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmployee(Employee emp) {
        return 0;
    }

    @Override
    public List<Employee> selectEmployee() {
        RowMapper<Employee> mapper = new EmpMapper();
        return jdbcTemplate.query(selectSQL, mapper);

    }

    @Override
    public Employee selectOneEmployee() {
        return null;
    }

    @Override
    public int updateEmployee(Employee emp) {
        return 0;
    }

    @Override
    public int deleteEmployee(int empid) {
        return 0;
    }

    private class EmpMapper implements RowMapper<Employee> {

        @Override
        public Employee mapRow(ResultSet rs, int num) throws SQLException {
            Employee emp = new Employee(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5)
                    );

            return emp;
        }
    }


}
