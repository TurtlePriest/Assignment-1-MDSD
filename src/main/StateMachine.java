package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	
	private Map<String,State> states = new HashMap<>();
	private List<String> integers = new ArrayList<String>();
	private State current;
	private State initial;
	private String currentEvent;
	
	private State getState(String name) {
		if(!states.containsKey(name)) {
			states.put(name, new State(name));
		}
		return states.get(name);
	}
	
	public StateMachine() {
		
	}

	public Machine build() {
		// TODO Auto-generated method stub
		Machine m = new Machine(states.values(), initial);
		m.getIntegers().addAll(integers);
		return m;
	}

	public StateMachine state(String name) {
		// TODO Auto-generated method stub
		current = getState(name);
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		initial = current;
		return this;
	}

	public StateMachine when(String event) {
		// TODO Auto-generated method stub
		currentEvent = event;
		return this;
	}

	public StateMachine to(String state) {
		// TODO Auto-generated method stub
		Transition t = new Transition(currentEvent, getState(state));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		integers.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		states.put(string, new State(Integer.toString(i)));
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
