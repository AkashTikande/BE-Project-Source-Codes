public class AdasSystemCppSource {
        public static void main(String[] args) {

            System.out.println("This is C++ code For Arduino uno");

            //Arduino IDE

/*


          #include <ESP8266WebServer-impl.h>
#include <ESP8266WebServer.h>
#include <ESP8266WebServerSecure.h>
#include <Parsing-impl.h>
#include <Uri.h>

#include <SoftwareSerial.h> // serial coomunication with oithe digital component
#include <TinyGPS++.h>

SoftwareSerial gsmSerial(D2, D3);  // SIM800L (TX-D2, RX-D3)
SoftwareSerial gpsSerial(D5, D6);  // NEO-7M GPS (TX-D5, RX-D6)

TinyGPSPlus gps;
String senderNumber = "+919359272856";  // Receiver's number

void setup() {
    Serial.begin(115200);
    gsmSerial.begin(9600);  // GSM baud rate
    gpsSerial.begin(9600);  // GPS baud rate (change to 4800 if needed)

    delay(1000);
    Serial.println("Initializing...");
    delay(15000);
    initGSM();
}

void loop() {
    checkSMS();
}

// Function to initialize the GSM module
void initGSM() {
    gsmSerial.println("AT"); // Check if GSM is responding
    delay(1000);
    gsmSerial.println("AT+CMGF=1"); // Set SMS mode to text
    delay(1000);
    gsmSerial.println("AT+CNMI=2,2,0,0,0"); // Enable SMS notification
    delay(1000);
}

// Function to check for incoming SMS
void checkSMS() {
    if (gsmSerial.available()) {
        String msg = gsmSerial.readString();
        Serial.println("Received SMS: " + msg);

        if (msg.indexOf("location") != -1) {
            Serial.println("Location request received.");
            se  ndLocation();
        }
    }
}

// Function to get GPS location and send SMS
void sendLocation() {
    float latitude = 0.0, longitude = 0.0;
    Serial.println("Fetching GPS data...");

    unsigned long startTime = millis();
    bool gpsUpdated = false;

    // Wait up to 30 seconds for valid GPS data
    while (millis() - startTime < 30000) {
        while (gpsSerial.available()) {
            char c = gpsSerial.read();
            Serial.write(c);  // Print raw GPS data for debugging
            gps.encode(c);
        }

        if (gps.location.isUpdated()) {
            latitude = gps.location.lat();
            longitude = gps.location.lng();
            gpsUpdated = true;
            break;
        }
    }

    if (!gpsUpdated) {
        Serial.println("No GPS data available.");
        gsmSerial.println("AT+CMGS=\"" + senderNumber + "\"");
        delay(1000);
        gsmSerial.print("GPS signal not available. Try again.");
        gsmSerial.write(26); // Send Ctrl+Z to end the message
        delay(3000);
    } else {
        String gmapLink = "https://www.google.com/maps?q=" + String(latitude, 6) + "," + String(longitude, 6);
        Serial.println("Sending location: " + gmapLink);

        gsmSerial.println("AT+CMGS=\"" + senderNumber + "\"");
        delay(1000);
        gsmSerial.print("Live Location: " + gmapLink);
        gsmSerial.write(26); // Send Ctrl+Z to end the message
        delay(3000);
    }
}


*/



        }
    }

//upload This code to respective board




