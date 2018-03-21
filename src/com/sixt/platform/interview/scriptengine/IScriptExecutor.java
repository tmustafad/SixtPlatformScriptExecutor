/**
 * 
 */
package com.sixt.platform.interview.scriptengine;

import com.sixt.platform.interview.model.VulnerabilityScript;

/**
 * @author TTTDEMIRCI
 *
 */
public interface IScriptExecutor<S extends VulnerabilityScript> {

	void execute(S script);

}
