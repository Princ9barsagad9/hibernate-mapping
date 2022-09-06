package com.hibernate_mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        //Question
//        Question que=new Question();
//        que.setQuestionId(121);
//        que.setQuestion("what is your name");
//        //answer1
//        Answer ans=new Answer();
//        ans.setAnswerId(432);
//        ans.setAnswer("prince");
//        ans.setQuestion(que);
//        //answer2
//        Answer ans2=new Answer();
//        ans2.setAnswerId(144);
//        ans2.setAnswer("Elon");
//        ans2.setQuestion(que);
//      //answer2
//        Answer ans3=new Answer();
//        ans3.setAnswerId(150);
//        ans3.setAnswer("Mukesh");
//        ans3.setQuestion(que);
        
//        List<Answer> list=new ArrayList<Answer>();
//        list.add(ans);
//        list.add(ans2);
//        list.add(ans3);
//        que.setAnswer(list);
       
        
        Session session= factory.openSession();
        
        Transaction tx=session.beginTransaction();
//        session.save(que);  
//        session.save(ans);
//        session.save(ans2);
//        session.save(ans3);
        
         Question q=(Question)session.get(Question.class,121);
         System.out.println(q.getQuestion());
         for(Answer a:q.getAnswer()) {
        	 
        	 System.out.println(a.getAnswer());
         }
        
        
        tx.commit();
        
        //fetching.......
//        Question newq=session.get(Question.class,121);
//        System.out.println(newq.getQuestion());
//        System.out.println(newq.getAnswer().getAnswer());
//        
        
        session.close();
        
        factory.close();
    }
}
//<mapping class="com.HibernateMapping.OneToOne.Question"/>
//<mapping class="com.HibernateMapping.OneToOne.Answer"/>