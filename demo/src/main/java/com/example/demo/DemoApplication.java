package com.example.demo;

import com.example.demo.examples.ClientComponent;
import com.example.demo.examples.SingletonComponent;
import com.example.demo.examples.TransientComponent;
import com.example.demo.models.*;
import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

        public static void createTableOfContent() {
                Book b = new Book("The book");
                Section cap1 = new Section("Chapter 1");
                Section cap11 = new Section("Subchapter 1.1");
                Section cap2 = new Section("Chapter 2");
                cap1.add(new Paragraph("Paragraph 1"));
                cap1.add(new Paragraph("Paragraph 2"));
                cap1.add(new Paragraph("Paragraph 3"));

                cap11.add(new ImageProxy("ImageOne"));
                cap11.add(new Image("ImageTwo"));

                cap2.add(new Paragraph("Paragraph 4"));
                cap1.add(cap11);
                cap1.add(new Paragraph("Some text"));
                cap1.add(new Table("Table 1"));
                b.addContent(cap1);
                b.addContent(cap2);
                TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
                b.acceptVisitor(tocUpdate);
                tocUpdate.getToC().acceptVisitor(new RenderContentVisitor());
        }
        public static void main(String[] args) {

                ApplicationContext context =
                        SpringApplication.run(DemoApplication.class, args);

                TransientComponent transientBean =
                        context.getBean(TransientComponent.class);
                transientBean.operation();

                transientBean = context.getBean(TransientComponent.class);
                transientBean.operation();

                SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
                singletonBean.operation();

                singletonBean = context.getBean(SingletonComponent.class);
                singletonBean.operation();

                ClientComponent c = context.getBean(ClientComponent.class);
                c.operation();

                c = (ClientComponent)context.getBean("clientComponent");
                c.operation();

                createTableOfContent();
//     Book b = new Book("The book");
//     Section cap1 = new Section("Chapter 1");
//     Paragraph p1 = new Paragraph("Paragraph 1");
//     cap1.add(p1);
//     cap1.add(new ImageProxy("ImageOne"));
//     b.addContent(cap1);
//
//     BookSaveVisitor saveVisitor = new BookSaveVisitorImpl();
//     b.accept(saveVisitor);
        }
}
