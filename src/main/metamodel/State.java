package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	public String name;
	private List<Transition> trans = new ArrayList<>();
	public State(String name) {
		super();
		this.name = name;
	}
	
	public void addTransition(Transition t) {
		this.trans.add(t);
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<Transition> getTransitions() {
		// TODO Auto-generated method stub
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		for (Transition t : trans) {
			if (t.getEvent().toString() == string) {
				return t;
			}
		}
		return null;
	}

}
