/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19 juil. 2018 10:22:19                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.servicelayer.internal.model.order;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type InMemoryCart first defined at extension core.
 */
@SuppressWarnings("all")
public class InMemoryCartModel extends CartModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "InMemoryCart";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public InMemoryCartModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public InMemoryCartModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Cart</code> at extension <code>core</code>
	 */
	@Deprecated
	public InMemoryCartModel(final CurrencyModel _currency, final Date _date, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setUser(_user);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Cart</code> at extension <code>core</code>
	 */
	@Deprecated
	public InMemoryCartModel(final CurrencyModel _currency, final Date _date, final ItemModel _owner, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOwner(_owner);
		setUser(_user);
	}
	
	
}
