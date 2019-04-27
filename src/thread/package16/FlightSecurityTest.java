package src.thread.package16;

public class FlightSecurityTest {
    static class Passengers extends Thread {
        private final FlightSecurity flightSecurity;
        private final String idCard;
        private final String boardingPass;

        public Passengers(FlightSecurity flightSecurity, String idCard, String boardingPass) {
            this.flightSecurity = flightSecurity;
            this.idCard = idCard;
            this.boardingPass = boardingPass;
        }

        @Override
        public void run() {
            while (true) {
                flightSecurity.pass(boardingPass, idCard);
            }
        }
    }


    public static void main(String[] args) {
        final FlightSecurity flightSecurity = new FlightSecurity();
        final FlightSecurity flightSecurity1 = new FlightSecurity();
        final FlightSecurity flightSecurity2= new FlightSecurity();
        new Passengers(flightSecurity, "A123456", "AF12345").start();
        new Passengers(flightSecurity1, "B123456", "BF12345").start();
        new Passengers(flightSecurity2, "C123456", "CF12345").start();
    }

}
