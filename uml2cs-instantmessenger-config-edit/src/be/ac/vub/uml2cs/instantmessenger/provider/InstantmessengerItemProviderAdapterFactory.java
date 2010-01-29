/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.provider;

import be.ac.vub.uml2cs.instantmessenger.util.InstantmessengerAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantmessengerItemProviderAdapterFactory extends InstantmessengerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007-2009, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantmessengerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantMessengerConfigurationItemProvider instantMessengerConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstantMessengerConfigurationAdapter() {
		if (instantMessengerConfigurationItemProvider == null) {
			instantMessengerConfigurationItemProvider = new InstantMessengerConfigurationItemProvider(this);
		}

		return instantMessengerConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalNetworkItemProvider localNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.LocalNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalNetworkAdapter() {
		if (localNetworkItemProvider == null) {
			localNetworkItemProvider = new LocalNetworkItemProvider(this);
		}

		return localNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JabberNetworkItemProvider jabberNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.JabberNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJabberNetworkAdapter() {
		if (jabberNetworkItemProvider == null) {
			jabberNetworkItemProvider = new JabberNetworkItemProvider(this);
		}

		return jabberNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultJabberTransportItemProvider defaultJabberTransportItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.DefaultJabberTransport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultJabberTransportAdapter() {
		if (defaultJabberTransportItemProvider == null) {
			defaultJabberTransportItemProvider = new DefaultJabberTransportItemProvider(this);
		}

		return defaultJabberTransportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.MEJabberTransport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEJabberTransportItemProvider meJabberTransportItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.MEJabberTransport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMEJabberTransportAdapter() {
		if (meJabberTransportItemProvider == null) {
			meJabberTransportItemProvider = new MEJabberTransportItemProvider(this);
		}

		return meJabberTransportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.SWTUserInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWTUserInterfaceItemProvider swtUserInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.SWTUserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSWTUserInterfaceAdapter() {
		if (swtUserInterfaceItemProvider == null) {
			swtUserInterfaceItemProvider = new SWTUserInterfaceItemProvider(this);
		}

		return swtUserInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.AWTUserInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWTUserInterfaceItemProvider awtUserInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.AWTUserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAWTUserInterfaceAdapter() {
		if (awtUserInterfaceItemProvider == null) {
			awtUserInterfaceItemProvider = new AWTUserInterfaceItemProvider(this);
		}

		return awtUserInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.SwingUserInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwingUserInterfaceItemProvider swingUserInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.SwingUserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwingUserInterfaceAdapter() {
		if (swingUserInterfaceItemProvider == null) {
			swingUserInterfaceItemProvider = new SwingUserInterfaceItemProvider(this);
		}

		return swingUserInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LCDUIUserInterfaceItemProvider lcduiUserInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.LCDUIUserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLCDUIUserInterfaceAdapter() {
		if (lcduiUserInterfaceItemProvider == null) {
			lcduiUserInterfaceItemProvider = new LCDUIUserInterfaceItemProvider(this);
		}

		return lcduiUserInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppletPackagingItemProvider webAppletPackagingItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.WebAppletPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebAppletPackagingAdapter() {
		if (webAppletPackagingItemProvider == null) {
			webAppletPackagingItemProvider = new WebAppletPackagingItemProvider(this);
		}

		return webAppletPackagingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpkgAppletPackagingItemProvider ipkgAppletPackagingItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.IpkgAppletPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIpkgAppletPackagingAdapter() {
		if (ipkgAppletPackagingItemProvider == null) {
			ipkgAppletPackagingItemProvider = new IpkgAppletPackagingItemProvider(this);
		}

		return ipkgAppletPackagingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.MIDletPackaging} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIDletPackagingItemProvider miDletPackagingItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.MIDletPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMIDletPackagingAdapter() {
		if (miDletPackagingItemProvider == null) {
			miDletPackagingItemProvider = new MIDletPackagingItemProvider(this);
		}

		return miDletPackagingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link be.ac.vub.uml2cs.instantmessenger.MaemoPackaging} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaemoPackagingItemProvider maemoPackagingItemProvider;

	/**
	 * This creates an adapter for a {@link be.ac.vub.uml2cs.instantmessenger.MaemoPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaemoPackagingAdapter() {
		if (maemoPackagingItemProvider == null) {
			maemoPackagingItemProvider = new MaemoPackagingItemProvider(this);
		}

		return maemoPackagingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (instantMessengerConfigurationItemProvider != null) instantMessengerConfigurationItemProvider.dispose();
		if (localNetworkItemProvider != null) localNetworkItemProvider.dispose();
		if (jabberNetworkItemProvider != null) jabberNetworkItemProvider.dispose();
		if (defaultJabberTransportItemProvider != null) defaultJabberTransportItemProvider.dispose();
		if (meJabberTransportItemProvider != null) meJabberTransportItemProvider.dispose();
		if (swtUserInterfaceItemProvider != null) swtUserInterfaceItemProvider.dispose();
		if (awtUserInterfaceItemProvider != null) awtUserInterfaceItemProvider.dispose();
		if (swingUserInterfaceItemProvider != null) swingUserInterfaceItemProvider.dispose();
		if (lcduiUserInterfaceItemProvider != null) lcduiUserInterfaceItemProvider.dispose();
		if (webAppletPackagingItemProvider != null) webAppletPackagingItemProvider.dispose();
		if (ipkgAppletPackagingItemProvider != null) ipkgAppletPackagingItemProvider.dispose();
		if (miDletPackagingItemProvider != null) miDletPackagingItemProvider.dispose();
		if (maemoPackagingItemProvider != null) maemoPackagingItemProvider.dispose();
	}

}
