# Flying Bird Animation

This is a simple Java Swing application that displays an animation of a flying bird. The animation can be controlled using buttons to start, pause, and resume the bird's movement. Additionally, there is a drop-down menu to adjust the animation speed.

## How to Use

1. Run the application by executing the `main` method in the `FlyingBird` class.
2. A window titled "Animation" will appear on the screen.
3. In the top section of the window, you will find the following buttons and drop-down menu:
   - "Start" button: Click this button to start the animation.
   - "Pause" button: Click this button to pause the animation at the current frame.
   - "Un Pause" button: Click this button to resume the animation after pausing.
   - "Sleep Time" drop-down menu: Use this drop-down menu to adjust the animation speed. The options represent the time (in milliseconds) that the thread sleeps between each frame update.
4. The bottom section of the window will display the animation of the flying bird.
5. When you click the "Start" button, the animation will begin, and the bird will cycle through four images (`b1.jpg`, `b2.jpg`, `b3.jpg`, and `b4.jpg`) to create the illusion of movement.
6. Use the "Pause" and "Un Pause" buttons to pause and resume the animation as needed.
7. To change the animation speed, select a new value from the "Sleep Time" drop-down menu.

## Note

- The bird animation is implemented using a separate thread to update the bird's image in a continuous loop.
- The animation speed can be adjusted by changing the sleep time between frames using the "Sleep Time" drop-down menu.
- The animation will keep looping indefinitely until the program is closed.
