/* ===================================== Simple Script =================================
*	Date:		05/01/2023
*	Autor:		Carlos Alberto Higuerey Martínez
*	Project:	Final Project for Argentina Programa 
*				Portfolio creation and deploy
* 	Detail:		This is the database for a CRUD app with my projects Info.
*  =====================================================================================
*/

CREATE DATABASE DBMyProjects;
USE DBMyProjects;


# -------------Table to store Projects--------------------


CREATE TABLE Projects(
	id INT AUTO_INCREMENT PRIMARY KEY,
    	title VARCHAR(1000),
    	tech VARCHAR(1000),
    	link VARCHAR(1000)
);

/*
**The following are Sample Values and a view of their storage.
**
**INSERT INTO Projects(id, title, tech, link) values (1, "Projecto de Prueba", "MySQL", "Www.internet.com");
**INSERT INTO Projects(id, title, tech, link) values (2, "Projecto de Segundo", "Angular", "Www.segundo.com");
**
**SELECT * FROM Projects
*/