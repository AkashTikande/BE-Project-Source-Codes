public class PythonSourceCode {
    public static void main(String[] args) {


        System.out.println("This is python code -Thony editor ");

  /*      import machine
import time
        time.sleep(2)
# Define pins
        TRIG_PIN = 11
        ECHO_PIN = 12
        BUTTON1_PIN = 9
        BUTTON2_PIN = 8
        IR1_PIN = 5
        IR2_PIN = 6
        IN1 = 1
        IN2 = 2
        IN3 = 3
        IN4 = 4
        a=0
        b=0
# Set up GPIO
                trig = machine.Pin(TRIG_PIN, machine.Pin.OUT)
        echo = machine.Pin(ECHO_PIN, machine.Pin.IN)
        button1 = machine.Pin(BUTTON1_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)
        button2 = machine.Pin(BUTTON2_PIN, machine.Pin.IN, machine.Pin.PULL_DOWN)
        ir1 = machine.Pin(IR1_PIN, machine.Pin.IN)
        ir2 = machine.Pin(IR2_PIN, machine.Pin.IN)

        motor1_forward = machine.Pin(IN1, machine.Pin.OUT)
        motor1_backward = machine.Pin(IN2, machine.Pin.OUT)
        motor2_forward = machine.Pin(IN4, machine.Pin.OUT)
        motor2_backward = machine.Pin(IN3, machine.Pin.OUT)

        def measure_distance():
    # Ensure trigger is low
        trig.low()
        time.sleep_us(2)

    # Send a 10us pulse to trigger
        trig.high()
        time.sleep_us(10)
        trig.low()

    # Wait for echo to go high and record the start time
        while echo.value() == 0:
        pass
                start = time.ticks_us()

    # Wait for echo to go low and record the end time
        while echo.value() == 1:
        pass
                end = time.ticks_us()

    # Calculate duration and distance
        duration = end - start
        distance = (duration * 0.0343) / 2  # Convert to cm

        return distance

        def move_forward():
        motor1_forward.high()
        motor1_backward.low()
        motor2_forward.high()
        motor2_backward.low()

        def move_backward():
        motor1_forward.low()
        motor1_backward.high()
        motor2_forward.low()
        motor2_backward.high()

        def turn_motors():
        motor1_forward.high()
        motor1_backward.low()
        motor2_forward.low()
        motor2_backward.high()

        def turn_right():
        motor1_forward.high()
        motor1_backward.low()
        motor2_forward.low()
        motor2_backward.high()

        def turn_left():
        motor1_forward.low()
        motor1_backward.high()
        motor2_forward.high()
        motor2_backward.low()

        def stop_motors():
        motor1_forward.low()
        motor1_backward.low()
        motor2_forward.low()
        motor2_backward.low()

        while True:
        dist = measure_distance()
        button1_state = button1.value()
        button2_state = button2.value()
        ir1_value = ir1.value()
        ir2_value = ir2.value()

        if button1_state == 1:
        a=1
        b=0

        if button2_state == 1:
        a=0
        b=1

        if b==1:
        if ir1_value==0 and ir2_value==1:
        turn_left()
        time.sleep(0.5)

        elif ir1_value==1 and ir2_value==0:
        turn_right()
        time.sleep(0.5)

        else:
        move_forward()
        time.sleep(1)




    # Obstacle avoidance logic
        if a == 1:
        if dist < 15:
        stop_motors()
        time.sleep(0.5)
        move_backward()
        time.sleep(2)
        turn_motors()
        time.sleep(2)
        stop_motors()

        else:
        move_forward()

    else:
        stop_motors()

        time.sleep(0.01)  # Delay before next measurement

*/
    }

}
