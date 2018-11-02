package org.xtext.example.domij.erdsl.handlers;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GenerateXmiFromErDSlHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public GenerateXmiFromErDSlHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		//get selection service 
		ISelectionService service = window.getSelectionService();
		//get selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		//get selected file
		IFile file = (IFile) structured.getFirstElement();
		//get the path
		IPath sourcePath = file.getLocation();
		if(sourcePath.getFileExtension().equals("erdsl")){
			GenerateXmiFromErDSl g = new GenerateXmiFromErDSl();
			String targetPath = g.generate(sourcePath);
		}
		return null;
	}
}
