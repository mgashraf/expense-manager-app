package org.cms.core.yard;

import org.cms.core.commons.BaseService;

import java.util.List;

public interface YardService extends BaseService<YardDto, Long> {

    YardExtendedDto getYardDetails(long id);

    List<YardDto> findAll(int page, int size);

}
