import java.util.Scanner;

public class AppFornitore {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.println("Descrivi il tuo fornitore");

            System.out.println("Nome");
            String nome = sc.nextLine();

            System.out.println("Tipologia");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME");
            System.out.println("3 - GIARDINAGGIO");
            byte tipologiaNum = sc.nextByte();
            TipologiaFornitore tipologiaFornitore = TipologiaFornitore.values()[tipologiaNum];
            sc.nextLine();

            System.out.println("P. Iva");
            String pIva = sc.nextLine();

            System.out.println("Luogo");
            String luogo = sc.nextLine();

            System.out.println("Numero di telefono");
            String nTelefono = sc.nextLine();

            System.out.println("E-mail");
            String email = sc.nextLine();

            System.out.println("Lingua principale");
            String linguaPrincipale = sc.nextLine();

            System.out.println("IBAN");
            String iban = sc.nextLine();

            System.out.println("Nome Referente");
            String nomeReferente = sc.nextLine();

            System.out.println("Note");
            String note = sc.nextLine();

            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("Nome: " + nome);
            System.out.println("Tipologia: " + tipologiaFornitore);
            System.out.println("P. Iva: " + pIva);
            System.out.println("Luogo: " + luogo);
            System.out.println("Numero di telefono: " + nTelefono);
            System.out.println("E-mail: " + email);
            System.out.println("Lingua principale: " + linguaPrincipale);
            System.out.println("IBAN: " + iban);
            System.out.println("Nome Referente: " + nomeReferente);
            System.out.println("Note: " + note);

            System.out.println("");

            System.out.println("Vuoi inserire un altro fonritore? (true/false)");
            continua = sc.nextBoolean();
            sc.nextLine();

        }

        System.out.println("");
        System.out.println("Grazie per aver utilizzato il nostro servizio, alla prossima!");

        sc.close();

    }
}
