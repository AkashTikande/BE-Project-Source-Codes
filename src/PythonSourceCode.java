public class PythonSourceCode {
    public static void main(String[] args) {
        System.out.println(         "                 System.out.println(                \"                import machine\\n\" +\n" +
                "                    \"import time\\n\" +\n" +
                "                    \"time.sleep(2)\\n\" +\n" +
                "                    \"# Define pins\\n\" +\n" +
                "                    \"TRIG_PIN = 11\\n\" +\n" +
                "                    \"ECHO_PIN = 12\\n\" +\n" +
                "                    \"BUTTON1_PIN = 9\\n\" +\n" +
                "                    \"BUTTON2_PIN = 8\\n\" +\n" +
                "                    \"IR1_PIN = 5\\n\" +\n" +
                "                    \"IR2_PIN = 6\\n\" +\n" +
                "                    \"IN1 = 1\\n\" +\n" +
                "                    \"IN2 = 2\\n\" +\n" +
                "                    \"IN3 = 3\\n\" +\n" +
                "                    \"IN4 = 4\\n\" +\n" +
                "                    \"a=0\\n\" +\n" +
                "                    \"b=0\\n\" +\n" +
                "                    \"# Set up GPIO\\n\" +\n" +
                "                    \"trig = machine.Pin(TRIG_PIN, machine.Pin.OUT)\\n\" +\n" +
                "                    \"echo = machine.Pin(ECHO_PIN, machine.Pin.IN)\\n\" +\n" +
                "                    \"button1 = machine.Pin(BUTTON1_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)\\n\" +\n" +
                "                    \"button2 = machine.Pin(BUTTON2_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)\\n\" +\n" +
                "                    \"ir1 = machine.Pin(IR1_PIN, machine.Pin.IN)\\n\" +\n" +
                "                    \"ir2 = machine.Pin(IR2_PIN, machine.Pin.IN)\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"motor1_forward = machine.Pin(IN1, machine.Pin.OUT)\\n\" +\n" +
                "                    \"motor1_backward = machine.Pin(IN2, machine.Pin.OUT)\\n\" +\n" +
                "                    \"motor2_forward = machine.Pin(IN4, machine.Pin.OUT)\\n\" +\n" +
                "                    \"motor2_backward = machine.Pin(IN3, machine.Pin.OUT)\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"def measure_distance():\\n\" +\n" +
                "                    \"    # Ensure trigger is low\\n\" +\n" +
                "                    \"    trig.low()\\n\" +\n" +
                "                    \"    time.sleep_us(2)\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    # Send a 10us pulse to trigger\\n\" +\n" +
                "                    \"    trig.high()\\n\" +\n" +
                "                    \"    time.sleep_us(10)\\n\" +\n" +
                "                    \"    trig.low()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    # Wait for echo to go high and record the start time\\n\" +\n" +
                "                    \"    while echo.value() == 0:\\n\" +\n" +
                "                    \"        pass\\n\" +\n" +
                "                    \"    start = time.ticks_us()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    # Wait for echo to go low and record the end time\\n\" +\n" +
                "                    \"    while echo.value() == 1:\\n\" +\n" +
                "                    \"        pass\\n\" +\n" +
                "                    \"    end = time.ticks_us()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    # Calculate duration and distance\\n\" +\n" +
                "                    \"    duration = end - start\\n\" +\n" +
                "                    \"    distance = (duration * 0.0343) / 2  # Convert to cm\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    return distance\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"def move_forward():\\n\" +\n" +
                "                    \"    motor1_forward.high()\\n\" +\n" +
                "                    \"    motor1_backward.low()\\n\" +\n" +
                "                    \"    motor2_forward.high()\\n\" +\n" +
                "                    \"    motor2_backward.low()\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"def move_backward():\\n\" +\n" +
                "                    \"    motor1_forward.low()\\n\" +\n" +
                "                    \"    motor1_backward.high()\\n\" +\n" +
                "                    \"    motor2_forward.low()\\n\" +\n" +
                "                    \"    motor2_backward.high()\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"def turn_motors():\\n\" +\n" +
                "                    \"    motor1_forward.high()\\n\" +\n" +
                "                    \"    motor1_backward.low()\\n\" +\n" +
                "                    \"    motor2_forward.low()\\n\" +\n" +
                "                    \"    motor2_backward.high()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"def turn_right():\\n\" +\n" +
                "                    \"    motor1_forward.high()\\n\" +\n" +
                "                    \"    motor1_backward.low()\\n\" +\n" +
                "                    \"    motor2_forward.low()\\n\" +\n" +
                "                    \"    motor2_backward.high()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"def turn_left():\\n\" +\n" +
                "                    \"    motor1_forward.low()\\n\" +\n" +
                "                    \"    motor1_backward.high()\\n\" +\n" +
                "                    \"    motor2_forward.high()\\n\" +\n" +
                "                    \"    motor2_backward.low()\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"def stop_motors():\\n\" +\n" +
                "                    \"    motor1_forward.low()\\n\" +\n" +
                "                    \"    motor1_backward.low()\\n\" +\n" +
                "                    \"    motor2_forward.low()\\n\" +\n" +
                "                    \"    motor2_backward.low()\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"while True:\\n\" +\n" +
                "                    \"    dist = measure_distance()\\n\" +\n" +
                "                    \"    button1_state = button1.value()\\n\" +\n" +
                "                    \"    button2_state = button2.value()\\n\" +\n" +
                "                    \"    ir1_value = ir1.value()\\n\" +\n" +
                "                    \"    ir2_value = ir2.value()\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"    if button1_state == 1:\\n\" +\n" +
                "                    \"        a=1\\n\" +\n" +
                "                    \"        b=0\\n\" +\n" +
                "                    \"        \\n\" +\n" +
                "                    \"    if button2_state == 1:\\n\" +\n" +
                "                    \"        a=0\\n\" +\n" +
                "                    \"        b=1\\n\" +\n" +
                "                    \"        \\n\" +\n" +
                "                    \"    if b==1:  \\n\" +\n" +
                "                    \"        if ir1_value==0 and ir2_value==1:\\n\" +\n" +
                "                    \"            turn_left()\\n\" +\n" +
                "                    \"            time.sleep(0.5)\\n\" +\n" +
                "                    \"        \\n\" +\n" +
                "                    \"        elif ir1_value==1 and ir2_value==0:\\n\" +\n" +
                "                    \"            turn_right()\\n\" +\n" +
                "                    \"            time.sleep(0.5)\\n\" +\n" +
                "                    \"            \\n\" +\n" +
                "                    \"        else:\\n\" +\n" +
                "                    \"            move_forward()\\n\" +\n" +
                "                    \"            time.sleep(1)\\n\" +\n" +
                "                    \"        \\n\" +\n" +
                "                    \"            \\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    # Obstacle avoidance logic\\n\" +\n" +
                "                    \"    if a == 1:\\n\" +\n" +
                "                    \"        if dist < 15:\\n\" +\n" +
                "                    \"            stop_motors()\\n\" +\n" +
                "                    \"            time.sleep(0.5)\\n\" +\n" +
                "                    \"            move_backward()\\n\" +\n" +
                "                    \"            time.sleep(2)\\n\" +\n" +
                "                    \"            turn_motors()\\n\" +\n" +
                "                    \"            time.sleep(2)\\n\" +\n" +
                "                    \"            stop_motors()\\n\" +\n" +
                "                    \"            \\n\" +\n" +
                "                    \"        else:\\n\" +\n" +
                "                    \"            move_forward()\\n\" +\n" +
                "                    \"            \\n\" +\n" +
                "                    \"    else:\\n\" +\n" +
                "                    \"        stop_motors()\\n\" +\n" +
                "                    \"    \\n\" +\n" +
                "                    \"    time.sleep(0.01)  # Delay before next measurement\\n  \");\n" +
                "        }               "         );
    }

}
