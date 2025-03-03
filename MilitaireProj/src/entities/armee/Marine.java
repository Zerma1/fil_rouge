package entities.armee;

import entities.grades.GMarine;

public class Marine extends Militaire {

    GMarine mGrade;

    //CONSTRUCTEUR
    public Marine(String nom, String prenom, GMarine grade, int matricule) {
        super(nom, prenom, matricule);
        this.mGrade = grade;
    }

    //SETTER
//    public void setNom(String nom) {
//        super.nom = nom;
//        }
//
//        public void setPrenom(String prenom) {
//            this.prenom = prenom;
//        }
        /**
         * @param mGrade the grade to set
         */
        public void setGrade(GMarine mGrade) {
            this.mGrade = mGrade;
        }
        /**
         *
         */
        public void setGrade() {

            mGrade = GMarine.setGrade();
        }

//        public void setMatricule(int matricule) {
//            this.matricule = matricule;
//        }

    //GETTER

    //METHODES

    //OVERRIDE
    @Override
    public String toString() {
        return "Marine ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + this.mGrade;
    }
}
