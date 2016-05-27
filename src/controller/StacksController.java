package controller;

import java.util.Stack;
import model.Dishes;

public class StacksController
	{
		Stack<Dishes> dishStack;
		
		public StacksController()
		{
			 dishStack = new Stack<Dishes>();
			 dishStack.push(new Dishes());
			 dishStack.peek();
			 dishStack.push(new Dishes());
			 dishStack.push(new Dishes());
			 dishStack.pop();
			 dishStack.peek();
		}
		
		public void start()
		{
			
		}
	}
