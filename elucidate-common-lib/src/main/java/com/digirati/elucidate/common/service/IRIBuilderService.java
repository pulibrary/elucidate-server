package com.digirati.elucidate.common.service;

public interface IRIBuilderService {

    public String buildW3CAnnotationIri(String collectionId, String annotationId);

    public String buildW3CCollectionIri(String collectionId);

    public String buildW3CPageIri(String collectionId, int page, boolean embeddedDescriptions);

    public String buildW3CCollectionSearchIri(String targetIri, boolean strict, String box);

    public String buildW3CPageSearchIri(String targetIri, boolean strict, String box, int page, boolean embeddedDescriptions);

    public String buildOAAnnotationIri(String collectionId, String annotationId);

    public String buildOACollectionIri(String collectionId);

    public String buildOAPageIri(String collectionId, int page, boolean embeddedDescriptions);

    public String buildOACollectionSearchIri(String targetIri, boolean strict, String box);

    public String buildOAPageSearchIri(String targetIri, boolean strict, String box, int page, boolean embeddedDescriptions);
}
