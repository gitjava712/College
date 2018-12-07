package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
 private int cllgId;
 private String cllgName;
 @Autowired
 @Qualifier(value="csc")
 private Department dept;
public College() {
	super();
}
public int getCllgId() {
	return cllgId;
}
public void setCllgId(int cllgId) {
	this.cllgId = cllgId;
}
public String getCllgName() {
	return cllgName;
}
public void setCllgName(String cllgName) {
	this.cllgName = cllgName;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "College [cllgId=" + cllgId + ", cllgName=" + cllgName + ", dept=" + dept + "]";
}

}
