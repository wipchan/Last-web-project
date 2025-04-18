package com.green.Lupang.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.green.Lupang.dto.Items;
import com.green.Lupang.dto.ItemsCategory;

@Mapper
public interface ItemsMapper {
	List<ItemsCategory> ic_list();

	List<Items> itemList(Map<String, Object> map);

	int itemCountByCategory(String ic_id);

	String ic_name(String ic_id);

	Items select(String i_id);

	List<Items> searchItemList(Map<String, Object> map);

	int countSearchItems(String query);

	List<Items> findTopWishItems(int limit);

	int insert(Items items);

	String getmaxi_id();

	int update(Items items);

	int delete(String i_id);

	void insertCategory(ItemsCategory itemsCategory);

	void deleteCategory(String ic_id);

	List<Items> adminItemsList(Map<String, Object> map);

	int allItemCount();

	int updateItemStatusDeleted(Items item);
}
