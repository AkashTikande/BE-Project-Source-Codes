public class AdasSystemSource {
        public static void main(String[] args) {


            //Arduino IDE


            System.out.println("This is C++ code of project Advanced " +
                    "ADAS system using Raspberry pi");
            System.out.println("                   #include <ESP8266WebServer-impl.h>\n" +
                    "#include <ESP8266WebServer.h>\n" +
                    "#include <ESP8266WebServerSecure.h>\n" +
                    "#include <Parsing-impl.h>\n" +
                    "#include <Uri.h>\n" +
                    "\n" +
                    "#include <SoftwareSerial.h> // serial coomunication with oithe digital component\n" +
                    "#include <TinyGPS++.h>\n" +
                    "\n" +
                    "SoftwareSerial gsmSerial(D2, D3);  // SIM800L (TX-D2, RX-D3)\n" +
                    "SoftwareSerial gpsSerial(D5, D6);  // NEO-7M GPS (TX-D5, RX-D6)\n" +
                    "\n" +
                    "TinyGPSPlus gps;\n" +
                    "String senderNumber = \"+919359272856\";  // Receiver's number\n" +
                    "\n" +
                    "void setup() {\n" +
                    "    Serial.begin(115200);\n" +
                    "    gsmSerial.begin(9600);  // GSM baud rate\n" +
                    "    gpsSerial.begin(9600);  // GPS baud rate (change to 4800 if needed)\n" +
                    "    \n" +
                    "    delay(1000);\n" +
                    "    Serial.println(\"Initializing...\");\n" +
                    "    delay(15000);\n" +
                    "    initGSM();\n" +
                    "}\n" +
                    "\n" +
                    "void loop() {\n" +
                    "    checkSMS();\n" +
                    "}\n" +
                    "\n" +
                    "// Function to initialize the GSM module\n" +
                    "void initGSM() {\n" +
                    "    gsmSerial.println(\"AT\"); // Check if GSM is responding\n" +
                    "    delay(1000);\n" +
                    "    gsmSerial.println(\"AT+CMGF=1\"); // Set SMS mode to text\n" +
                    "    delay(1000);\n" +
                    "    gsmSerial.println(\"AT+CNMI=2,2,0,0,0\"); // Enable SMS notification\n" +
                    "    delay(1000);\n" +
                    "}\n" +
                    "\n" +
                    "// Function to check for incoming SMS\n" +
                    "void checkSMS() {\n" +
                    "    if (gsmSerial.available()) {\n" +
                    "        String msg = gsmSerial.readString();\n" +
                    "        Serial.println(\"Received SMS: \" + msg);\n" +
                    "        \n" +
                    "        if (msg.indexOf(\"location\") != -1) {\n" +
                    "            Serial.println(\"Location request received.\");\n" +
                    "            se  ndLocation();\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "// Function to get GPS location and send SMS\n" +
                    "void sendLocation() {\n" +
                    "    float latitude = 0.0, longitude = 0.0;\n" +
                    "    Serial.println(\"Fetching GPS data...\");\n" +
                    "\n" +
                    "    unsigned long startTime = millis();\n" +
                    "    bool gpsUpdated = false;\n" +
                    "\n" +
                    "    // Wait up to 30 seconds for valid GPS data\n" +
                    "    while (millis() - startTime < 30000) {\n" +
                    "        while (gpsSerial.available()) {\n" +
                    "            char c = gpsSerial.read();\n" +
                    "            Serial.write(c);  // Print raw GPS data for debugging\n" +
                    "            gps.encode(c);\n" +
                    "        }\n" +
                    "\n" +
                    "        if (gps.location.isUpdated()) {\n" +
                    "            latitude = gps.location.lat();\n" +
                    "            longitude = gps.location.lng();\n" +
                    "            gpsUpdated = true;\n" +
                    "            break;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    if (!gpsUpdated) {\n" +
                    "        Serial.println(\"No GPS data available.\");\n" +
                    "        gsmSerial.println(\"AT+CMGS=\\\"\" + senderNumber + \"\\\"\");\n" +
                    "        delay(1000);\n" +
                    "        gsmSerial.print(\"GPS signal not available. Try again.\");\n" +
                    "        gsmSerial.write(26); // Send Ctrl+Z to end the message\n" +
                    "        delay(3000);\n" +
                    "    } else {\n" +
                    "        String gmapLink = \"https://www.google.com/maps?q=\" + String(latitude, 6) + \",\" + String(longitude, 6);\n" +
                    "        Serial.println(\"Sending location: \" + gmapLink);\n" +
                    "        \n" +
                    "        gsmSerial.println(\"AT+CMGS=\\\"\" + senderNumber + \"\\\"\");\n" +
                    "        delay(1000);\n" +
                    "        gsmSerial.print(\"Live Location: \" + gmapLink);\n" +
                    "        gsmSerial.write(26); // Send Ctrl+Z to end the message\n" +
                    "        delay(3000);\n" +
                    "    }\n" +
                    "}                     ");


            System.out.println("This os a Python Code which holds algorithem to run the car");


            

            // Thony Editor


        }
    }

//upload This code to respective board




