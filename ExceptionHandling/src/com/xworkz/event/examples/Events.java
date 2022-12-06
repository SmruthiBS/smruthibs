package com.xworkz.event.examples;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.image.ImagingOpException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import com.sun.javafx.geom.IllegalPathStateException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;

public class Events {
	public void method1() {
		System.out.println("running method1");
		throw new RuntimeException();
		
	}
public void method2() {
	System.out.println("ruuning method2");
	throw new  AnnotationTypeMismatchException(null, null);
}
public void method3() {
	System.out.println("ruuning method3");
	throw new ArithmeticException();
}


public void method4() {
	System.out.println("ruuning method4");
	throw new ArrayStoreException();
}

public void method5() {
	System.out.println("ruuning method5");
	throw new BufferOverflowException();
}

public void method6() {
	System.out.println("ruuning method6");
	throw new  BufferUnderflowException();
}

public void method7() {
	System.out.println("ruuning method7");
	throw new CannotRedoException() ;
}

public void method8() {
	System.out.println("ruuning method8");
	throw new CannotUndoException();
}

public void method9() {
	System.out.println("ruuning method9");
	throw new  ClassCastException();
}

public void method10() {
	System.out.println("ruuning method10");
	throw new CMMException(null);
}
public void method11() {
	System.out.println("ruuning method11");
	throw new ConcurrentModificationException();
}
public void method12() {
	System.out.println("ruuning method12");
	throw new DataBindingException(null);
}
public void method13() {
	System.out.println("ruuning method13");
	throw new DOMException((short) 0, null);
}
public void method14() {
	System.out.println("ruuning method14");
	throw new EmptyStackException();
}
public void method15() {
	System.out.println("ruuning method15");
	throw new EnumConstantNotPresentException(null, null);
}
public void method16() {
	System.out.println("ruuning method16");
	throw new EventException((short) 0, null);
}
public void method17() {
	System.out.println("ruuning method17");
	throw new FileSystemAlreadyExistsException();
}
public void method18() {
	System.out.println("ruuning method18");
	throw new FileSystemNotFoundException();
}
public void method19() {
	System.out.println("ruuning method19");
	throw new IllegalArgumentException();
}
public void method20() {
	System.out.println("ruuning method20");
	throw new  IllegalMonitorStateException();
	
}

public void method21() {
	System.out.println("running method 21");
	throw new  IllegalStateException();
}
public void method22() {
	System.out.println("running method 22");
	throw new IllformedLocaleException();
}
public void method23() {
	System.out.println("running method 23");
	throw new  ImagingOpException(null);
}
public void method24() {
	System.out.println("running method 24");
	throw new IncompleteAnnotationException(null, null);
}

	
	public void method25() {
		System.out.println("running method 25");
		throw new IndexOutOfBoundsException();
	}
	public void method26() {
		System.out.println("running method 26");
		throw new JMRuntimeException ();
	}
	public void method27() {
		System.out.println("running method 27");
		throw new LSException((short) 0, null);
	}
	public void method28() {
		System.out.println("running method 28");
		throw new MalformedParameterizedTypeException();
	}
	public void method29() {
		System.out.println("running method 29");
		throw new  MirroredTypesException(null);
	}
	public void method30() {
		System.out.println("running method 30");
		throw new MissingResourceException(null, null, null);
	}
	public void method31() {
		System.out.println("running method 31");
		throw new NegativeArraySizeException();
	}
	public void method32() {
		System.out.println("running method 32");
		throw new NoSuchElementException();
	}
	public void method33() {
		System.out.println("running method 33");
		throw new NoSuchMechanismException();
	}
	public void method34() {
		System.out.println("running method 34");
		throw new NullPointerException();
	}
	public void method35() {
	System.out.println("running method 35 ");
	throw new ProfileDataException(null);
	
	//error exception
}
	public void method36() {
		System.out.println("running method 36 ");
		throw new  AssertionError();
	}
	public void method37() {
		System.out.println("running method 37 ");
		throw new AWTError(null);
	}
	
	
		public void method38() {
			System.out.println("running method 38 ");
			throw new FactoryConfigurationError();}
		
			public void method39() {
				System.out.println("running method 39");
				throw new CoderMalfunctionError(null);
			}
			public void method40() {
				System.out.println("running method 40  ");
				throw new  FactoryConfigurationError();
			}
			public void method41() {
				System.out.println("running method 41 ");
				throw new  IOError(null);
			}
			public void method42() {
				System.out.println("running method 42 ");
				throw new LinkageError();
			}
			public void method43() {
				System.out.println("running method 43 ");
				throw new ServiceConfigurationError("abc");
			}
			public void method44() {
				System.out.println("running method 44 ");
				throw new ThreadDeath();
			}
			public void method45() {
				System.out.println("running method 45 ");
				throw new TransformerFactoryConfigurationError();
			}
			public void method46() {
				System.out.println("running method 46 ");
				throw new VirtualMachineError() {
				};

			}
			
			//exception
			public void method47() throws AclNotFoundException {
				System.out.println("running method 47 ");
				throw new AclNotFoundException();
			}
			public void method48() throws ActivationException {
				System.out.println("running method 48 ");
				throw new ActivationException();
			}
			public void method49() {
				System.out.println("running method 49 ");
				throw new  AlreadyBoundException();
			}
			public void method50() throws ApplicationException {
				System.out.println("running method 50 ");
				throw new  ApplicationException(null, null);
			}
			public void method51() throws AWTException {
				System.out.println("running method 51 ");
				throw new  AWTException(null);
			}
			public void method52() throws BackingStoreException {
				System.out.println("running method 52 ");
				throw new BackingStoreException("abc");
			}
			public void method53() throws BadAttributeValueExpException {
				System.out.println("running method 53 ");
				throw new BadAttributeValueExpException(null);
			}
			public void method54() throws BadLocationException {
				System.out.println("running method 54 ");
				throw new BadLocationException(null, 0);
			}
			public void method55() throws BadStringOperationException {
				System.out.println("running method 55 ");
				throw new BadStringOperationException(null);
			}
			public void method56() throws BrokenBarrierException {
				System.out.println("running method 56 ");
				throw new BrokenBarrierException();
			}
			public void method57() throws CertificateException {
				System.out.println("running method 57 ");
				throw new CertificateException();
			}
			public void method58() throws CertificateException {
				System.out.println("running method 58 ");
				throw new CertificateException();
			}
			public void method59() throws CertificateException {
				System.out.println("running method 59 ");
				throw new CertificateException();
			}
			public void method60() throws CloneNotSupportedException {
				System.out.println("running method 60 ");
				throw new CloneNotSupportedException();
			}
			public void method61() throws DataFormatException {
				System.out.println("running method 61 ");
				throw new DataFormatException();
			}
			public void method62() throws DatatypeConfigurationException {
				System.out.println("running method 62 ");
				throw new  DatatypeConfigurationException();
			}
			public void method63() throws DestroyFailedException {
				System.out.println("running method 63 ");
				throw new DestroyFailedException();
			}
			public void method64() throws ExpandVetoException {
				System.out.println("running method 64 ");
				throw new  ExpandVetoException(null);
			}
			public void method65() throws FontFormatException {
				System.out.println("running method 65 ");
				throw new FontFormatException(null);
			}
			public void method66() throws GeneralSecurityException {
				System.out.println("running method 66 ");
				throw new  GeneralSecurityException();
			}
			public void method67() throws GSSException {
				System.out.println("running method 67 ");
				throw new GSSException(0);
			}
			
			public void method68() throws IllegalClassFormatException {
				System.out.println("running method 68 ");
				throw new  IllegalClassFormatException();
			}
			public void method69() throws InterruptedException {
				System.out.println("running method 69 ");
				throw new InterruptedException();
			}
			public void method70() throws IntrospectionException {
				System.out.println("running method 70 ");
				throw new IntrospectionException("smruthi");
			}
			public void method71() throws InvalidApplicationException {
				System.out.println("running method 71 ");
				throw new InvalidApplicationException(null);
			}
			public void method72() throws InvalidMidiDataException {
				System.out.println("running method 72 ");
				throw new  InvalidMidiDataException();
			}
			public void method73() throws InvalidPreferencesFormatException {
				System.out.println("running method 73 ");
				throw new InvalidPreferencesFormatException("smruthi");
			}
			public void method74() throws InvalidTargetObjectTypeException {
				System.out.println("running method 74 ");
				throw new InvalidTargetObjectTypeException();
			}
			public void method75() throws IOException {
				System.out.println("running method 75 ");
				throw new IOException();
			}
			public void method76() throws JAXBException {
				System.out.println("running method 76 ");
				throw new  JAXBException("smruthi");
			}
			public void method77() throws JMException {
				System.out.println("running method 77 ");
				throw new JMException();
			}
			public void method78() throws KeySelectorException {
				System.out.println("running method 78 ");
				throw new KeySelectorException();
			}
			public void method79() throws LastOwnerException {
				System.out.println("running method 79 ");
				throw new  LastOwnerException();
			}
			public void method80() throws LineUnavailableException {
				System.out.println("running method 80 ");
				throw new LineUnavailableException();
			}
			public void method81() throws MarshalException {
				System.out.println("running method 81 ");
				throw new  MarshalException("smruthi");
			}
			public void method82() throws MidiUnavailableException {
				System.out.println("running method 82 ");
				throw new  MidiUnavailableException();
				//error exception
			}
			public void method83() {
				System.out.println("running method 83 ");
				throw new BootstrapMethodError();
			}
			public void method84() {
				System.out.println("running method 84 ");
				throw new ClassCircularityError();
			}
			public void method85() {
				System.out.println("running method 85 ");
				throw new ClassFormatError();
			}
			public void method86() {
				System.out.println("running method 86 ");
				throw new UnsupportedClassVersionError();
			}
			public void method87() {
				System.out.println("running method 87");
				throw new ExceptionInInitializerError();
			}
			public void method88() {
				System.out.println("running method 88 ");
				throw new AbstractMethodError();
			}
			public void method89() {
				System.out.println("running method 89 ");
				throw new IllegalAccessError();
			}
			public void method90() {
				System.out.println("running method 90 ");
				throw new InstantiationError();
			}
			public void method91() throws InvocationTargetException {
				System.out.println("running method 91 ");
				throw new InvocationTargetException(null);
			}
			public void method92() {
				System.out.println("running method 92 ");
				throw new NoSuchFieldError();
			}
			public void method93() {
				System.out.println("running method 93 ");
				throw new NoClassDefFoundError();
			}
			
			public void method94() {
				System.out.println("running method 94 ");
				throw new UnsatisfiedLinkError();
			}
			
			public void method95() {
				System.out.println("running method 95 ");
				throw new VerifyError();
			}
			
			public void method96() {
				System.out.println("running method 96 ");
				throw new InternalError();
			}
			
			public void method97() {
				System.out.println("running method 97 ");
				throw new OutOfMemoryError();
			}
			public void method98() {
				System.out.println("running method 98 ");
				throw new StackOverflowError();
			}
			
			public void method99() {
				System.out.println("running method 99 ");
				throw new UncheckedIOException(null);
			}
			public void method100() {
				System.out.println("running method 100 ");
				throw new ProfileDataException(null);
			}
			
			
			
			
	}

