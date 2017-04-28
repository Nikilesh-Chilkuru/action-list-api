package com.actionlistapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.LinkBuilder;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

import com.actionlistapi.model.ActionRequest;
import com.actionlistapi.model.ProcessInstance;

@Component
public class ActionRequestResourceProcessor implements ResourceProcessor<Resource<ActionRequest>>
{
  @Autowired
  private RepositoryRestMvcConfiguration configuration;

  @Override
  public Resource<ActionRequest> process(Resource<ActionRequest> resource)
  {
    LinkBuilder link = configuration.entityLinks().linkForSingleResource(ProcessInstance.class,
        resource.getContent().getProcessInstanceId()+"/open");

    resource.add(link.withRel("processInstance"));
    
    link = configuration.entityLinks().linkForSingleResource(ProcessInstance.class,
    		resource.getContent().getProcessInstanceId()+"/log");

    resource.add(link.withRel("log"));
    
    link = configuration.entityLinks().linkForSingleResource(ActionRequest.class,"");

    resource.add(link.withRel("actionList"));
    
    Link initiatorLink = new Link("https://people.iu.edu/");

    resource.add(initiatorLink.withRel("initiator"));

    return resource;
  }
}
