package day22_MultiDimensionalArrays;

public class CydeoStudents {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String [][] batch25Groups = { {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},
                {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},
                {"Fady", "Break", "Clock", "Cihad", "Muhtar"}  };

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24Groups = {  {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"},
                                       {"Layla", "Oksana", "Tyler", "Murodil"},
                                       {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"}  };


        String [][] cydeoStudents = {  {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"},
                {"Layla", "Oksana", "Tyler", "Murodil"},
                {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"},
                {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},
                {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},
                {"Fady", "Break", "Clock", "Cihad", "Muhtar"}  };

        for (String[] eachClass : cydeoStudents) {
            for (int i = 0; i < eachClass.length; i++) {
                System.out.print(eachClass[i] + "\t");

            }
            System.out.println();
        }
    }
}
/*
3. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
		 		String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
		 		String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

		2. declare an array variable named batch25Groups with the length of three
				2.1 Assign batch25Group1, batch25Group2, batch25Group1=3 to each indexes of the variable batch25Groups

		3. given the following arrays:
				String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch24Group1, batch24Group2, batch24Group1=3 to each indexes of the variable batch25Groups


		5. declare an array variable named CydeoStudents and assign batch24Groups & batch25Groups to the indexes of CydeoStudents

		6. Print the names of each students
 */