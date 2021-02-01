package BounceBall;

import java.awt.*;
/** BounceTheBall constructs and starts the objects in the animation.  */
public class Activator
{ public static void main(String[] args)
  { // construct the model objects:
    int box_size = 100;
    int balls_radius = 2;
    Box box = new Box(box_size);
    // place the ball not quite in the box's center; about 3/5 position:
    Ball ball = new Ball(box,(int)(box_size / 3.0),
                                     (int)(box_size / 5.0),
                                     balls_radius );
    BallWriter ball_writer = new BallWriter(ball, Color.red);
    BoxWriter box_writer  = new BoxWriter(box);
    AnimationWriter writer
             = new AnimationWriter(ball_writer , box_writer);
    // construct the controller and start it:
    new Controller(ball, writer).runAnimation();
  }
}
