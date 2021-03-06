package controller.employee.manager;

import java.io.IOException;

import domain.mediator.staff.StaffClinicModel;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeFactory;
import domain.model.staff.Type;

import view.manager.addemployee.AddEmployeeView;

public class AddEmployeeController {
	private StaffClinicModel staffClinicModel;
	private AddEmployeeView view;

	public AddEmployeeController(StaffClinicModel staffClinicModel, AddEmployeeView view)
			throws ClassNotFoundException, IOException {
		super();
		this.staffClinicModel = staffClinicModel;
		this.view = view;
	}

	public String[] setComboboxValue() {
		return staffClinicModel.reachType();
	}

	public void executes() {
		String[] data = view.getTextFieldValues();
//		System.out.println(data[0]+data[1]+data[2]+data[3]+data[4]+data[5]+data[6]+data[7]);
		staffClinicModel.addOneEmployee(data);
//
//		Employee employee = EmployeeFactory.create(data[0], data[1], data[2], null, null, data[5], data[6], data[7],
//				Type.Doctor);
//		staffClinicModel.addOneEmployee(employee);
//		System.out.println(employee.toString());

	}
}
