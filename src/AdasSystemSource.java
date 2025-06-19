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


            System.out.println("This os a Python Code which holds algorithem to erun the car");


            // Thony Editor


            System.out.println(                "                import machine\n" +
                    "import time\n" +
                    "time.sleep(2)\n" +
                    "# Define pins\n" +
                    "TRIG_PIN = 11\n" +
                    "ECHO_PIN = 12\n" +
                    "BUTTON1_PIN = 9\n" +
                    "BUTTON2_PIN = 8\n" +
                    "IR1_PIN = 5\n" +
                    "IR2_PIN = 6\n" +
                    "IN1 = 1\n" +
                    "IN2 = 2\n" +
                    "IN3 = 3\n" +
                    "IN4 = 4\n" +
                    "a=0\n" +
                    "b=0\n" +
                    "# Set up GPIO\n" +
                    "trig = machine.Pin(TRIG_PIN, machine.Pin.OUT)\n" +
                    "echo = machine.Pin(ECHO_PIN, machine.Pin.IN)\n" +
                    "button1 = machine.Pin(BUTTON1_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)\n" +
                    "button2 = machine.Pin(BUTTON2_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)\n" +
                    "ir1 = machine.Pin(IR1_PIN, machine.Pin.IN)\n" +
                    "ir2 = machine.Pin(IR2_PIN, machine.Pin.IN)\n" +
                    "\n" +
                    "motor1_forward = machine.Pin(IN1, machine.Pin.OUT)\n" +
                    "motor1_backward = machine.Pin(IN2, machine.Pin.OUT)\n" +
                    "motor2_forward = machine.Pin(IN4, machine.Pin.OUT)\n" +
                    "motor2_backward = machine.Pin(IN3, machine.Pin.OUT)\n" +
                    "\n" +
                    "def measure_distance():\n" +
                    "    # Ensure trigger is low\n" +
                    "    trig.low()\n" +
                    "    time.sleep_us(2)\n" +
                    "    \n" +
                    "    # Send a 10us pulse to trigger\n" +
                    "    trig.high()\n" +
                    "    time.sleep_us(10)\n" +
                    "    trig.low()\n" +
                    "    \n" +
                    "    # Wait for echo to go high and record the start time\n" +
                    "    while echo.value() == 0:\n" +
                    "        pass\n" +
                    "    start = time.ticks_us()\n" +
                    "    \n" +
                    "    # Wait for echo to go low and record the end time\n" +
                    "    while echo.value() == 1:\n" +
                    "        pass\n" +
                    "    end = time.ticks_us()\n" +
                    "    \n" +
                    "    # Calculate duration and distance\n" +
                    "    duration = end - start\n" +
                    "    distance = (duration * 0.0343) / 2  # Convert to cm\n" +
                    "    \n" +
                    "    return distance\n" +
                    "\n" +
                    "def move_forward():\n" +
                    "    motor1_forward.high()\n" +
                    "    motor1_backward.low()\n" +
                    "    motor2_forward.high()\n" +
                    "    motor2_backward.low()\n" +
                    "\n" +
                    "def move_backward():\n" +
                    "    motor1_forward.low()\n" +
                    "    motor1_backward.high()\n" +
                    "    motor2_forward.low()\n" +
                    "    motor2_backward.high()\n" +
                    "\n" +
                    "def turn_motors():\n" +
                    "    motor1_forward.high()\n" +
                    "    motor1_backward.low()\n" +
                    "    motor2_forward.low()\n" +
                    "    motor2_backward.high()\n" +
                    "    \n" +
                    "def turn_right():\n" +
                    "    motor1_forward.high()\n" +
                    "    motor1_backward.low()\n" +
                    "    motor2_forward.low()\n" +
                    "    motor2_backward.high()\n" +
                    "    \n" +
                    "def turn_left():\n" +
                    "    motor1_forward.low()\n" +
                    "    motor1_backward.high()\n" +
                    "    motor2_forward.high()\n" +
                    "    motor2_backward.low()\n" +
                    "\n" +
                    "def stop_motors():\n" +
                    "    motor1_forward.low()\n" +
                    "    motor1_backward.low()\n" +
                    "    motor2_forward.low()\n" +
                    "    motor2_backward.low()\n" +
                    "\n" +
                    "while True:\n" +
                    "    dist = measure_distance()\n" +
                    "    button1_state = button1.value()\n" +
                    "    button2_state = button2.value()\n" +
                    "    ir1_value = ir1.value()\n" +
                    "    ir2_value = ir2.value()\n" +
                    "\n" +
                    "    if button1_state == 1:\n" +
                    "        a=1\n" +
                    "        b=0\n" +
                    "        \n" +
                    "    if button2_state == 1:\n" +
                    "        a=0\n" +
                    "        b=1\n" +
                    "        \n" +
                    "    if b==1:  \n" +
                    "        if ir1_value==0 and ir2_value==1:\n" +
                    "            turn_left()\n" +
                    "            time.sleep(0.5)\n" +
                    "        \n" +
                    "        elif ir1_value==1 and ir2_value==0:\n" +
                    "            turn_right()\n" +
                    "            time.sleep(0.5)\n" +
                    "            \n" +
                    "        else:\n" +
                    "            move_forward()\n" +
                    "            time.sleep(1)\n" +
                    "        \n" +
                    "            \n" +
                    "    \n" +
                    "    \n" +
                    "    # Obstacle avoidance logic\n" +
                    "    if a == 1:\n" +
                    "        if dist < 15:\n" +
                    "            stop_motors()\n" +
                    "            time.sleep(0.5)\n" +
                    "            move_backward()\n" +
                    "            time.sleep(2)\n" +
                    "            turn_motors()\n" +
                    "            time.sleep(2)\n" +
                    "            stop_motors()\n" +
                    "            \n" +
                    "        else:\n" +
                    "            move_forward()\n" +
                    "            \n" +
                    "    else:\n" +
                    "        stop_motors()\n" +
                    "    \n" +
                    "    time.sleep(0.01)  # Delay before next measurement\n                  "                               );
        }
    }

//upload This code to respective board




