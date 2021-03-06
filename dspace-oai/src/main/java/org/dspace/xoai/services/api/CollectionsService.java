/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.xoai.services.api;

import org.dspace.content.Collection;
import org.dspace.content.Community;
import org.dspace.content.Item;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public interface CollectionsService {
    List<UUID> getAllSubCollections(UUID communityId) throws SQLException;
    List<Community> flatParentCommunities(Collection collection) throws SQLException;
    List<Community> flatParentCommunities(Community community) throws SQLException;
    List<Community> flatParentCommunities(Item item) throws SQLException;
}
