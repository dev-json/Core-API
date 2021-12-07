package minevalley.core.api.commerce;

import minevalley.core.api.economy.BankAccount;

import java.util.List;

public interface Department {

    /**
     * Gets the holder of this department.
     * @return holder of this department (company/organization)
     */
    Registered getHolder();

    /**
     * Gets this departments banking account.
     * @return departments banking account
     */
    BankAccount getBankAccount();

    /**
     * Gets whether this department is the main department of the organization / company. The main department is the department, new members will be put into.
     * @return true, if this department is the main department
     */
    boolean isMainDepartment();

    /**
     * Gets the base wage this departments members get. If a different base wage is specified in the member object, this is used.
     * <p>
     * <b>Note:</b> This is only usable for company-departments!
     * @return departments base wage
     */
    double getBaseWage();

    /**
     * Gets the service wage this departments members get. If a different service wage is specified in the member object, this is used.
     * <p>
     * <b>Note:</b> This is only usable for company-departments!
     * @return departments service wage
     */
    double getServiceWage();

    /**
     * Gets the tasks the members of this department are allowed to handle.
     * <p>
     * <b>Note:</b> This is only usable for company-departments!
     * @return list of tasks to handle
     */
    List<Task> getTasks();
}
