/**
 * 
 */
package com.sixt.platform.interview.scriptfactory;

import java.util.List;

/**
 * @author TTTDEMIRCI
 *
 */
public interface IScriptFactory<S> {

	
	S create(int id,List<Integer> dependencies);
}
