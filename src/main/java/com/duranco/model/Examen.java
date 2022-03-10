package com.duranco.model;

public class Examen {
private int id;
private String matiere;
private double exam,tp;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMatiere() {
	return matiere;
}
public void setMatiere(String matiere) {
	this.matiere = matiere;
}
public double getExam() {
	return exam;
}
public void setExam(double exam) {
	this.exam = exam;
}
public double getTp() {
	return tp;
}
public void setTp(double tp) {
	this.tp = tp;
}
public double calculeMoyenne()
{
return (this.exam*0.7+ this.tp*0.30);	

}
public Examen(int id, String matiere, double exam, double tp) {
	super();
	this.id = id;
	this.matiere = matiere;
	this.exam = exam;
	this.tp = tp;
}
public Examen() {
	super();
	// TODO Auto-generated constructor stub
}
public Examen(double exam, double tp) {
	super();
	this.exam = exam;
	this.tp = tp;
}
@Override
public String toString() {
	return "Examen [id=" + id + ", matiere=" + matiere + ", exam=" + exam + ", tp=" + tp + ", Moyenne="
			+ calculeMoyenne() + "]";
}





}
