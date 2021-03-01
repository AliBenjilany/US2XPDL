# US2XPDL
Transformation de modèles : UserStories to XPDL

L'objecif de cette transformation est de parvenir à générer un modèle XPDL, à partir d'un modèle de user story.

Une User Story est une description informelle d'un besoin utilisateur qui suis souvent le pattern : As a [user] I want to be able to do [activity].

XPDL est la représentation XML du BPMN, qui est un langage de modélisation orienté processus métiers.

L'objectif ultime étant de passer d'une spécification informelle sous forme textuelle, à une specification semi-formelle. 

Les transformations suivantes sont réalisées avec le langage ATL (Atlas Transformation Language), et le langage de contraintes sur les objets OCL(Object Constraint Language).

Mapped entities :

- ProductBacklog 2 Process
- Goal 2 Pool
- Role 2 Lane
- Task 2 Task
- Event 2 EventStart
- Event 2 EventIntermediate
- Event 2 EventEnd
- ConditionInclusive 2 GatewayInclusiveSplit
- ConditionInclusive 2 GatewayInclusiveJoin
- ConditionExclusive 2 GatewayExclusiveSplit
- ConditionExclusive 2 GatewayExclusiveJoin
- ConditionParallel 2 GatewayParallelSplit
- ConditionParallel 2 GatewayParallelJoin 

Mapped relationships : 

- (ProductBacklog # Goals) 2 (Process # Pool)  

To do : 
- (UserStory ?R? Goal&Role) 2 (Pool # Lanes) 
- (UserStory # Element) 2 (Lane # flowobject)
