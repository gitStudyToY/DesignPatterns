package com.mode.design.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static String getChartType() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static Object getPictureType() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("pictureType");
            Node classNode = nl.item(0).getFirstChild();
            String pictureType = classNode.getNodeValue().trim();
            Class c = Class.forName(pictureType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getSystem() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("systemType");
            Node classNode = nl.item(0).getFirstChild();
            String systemType = classNode.getNodeValue().trim();
            Class c = Class.forName(systemType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getBuilder() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("builderType");
            Node classNode = nl.item(0).getFirstChild();
            String systemType = classNode.getNodeValue().trim();
            Class c = Class.forName(systemType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getAdapter() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("adapterType");
            Node classNode = nl.item(0).getFirstChild();
            String systemType = classNode.getNodeValue().trim();
            Class c = Class.forName(systemType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getBriage(String type) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            NodeList nl = doc.getElementsByTagName("bridgeType");
            Node classNode = null;
            //获取包含图表类型的文本节点
            if("file".equals(type) ) {
                classNode = nl.item(0).getFirstChild();
            }else{
                classNode = nl.item(1).getFirstChild();
            }

            String systemType = classNode.getNodeValue().trim();
            Class c = Class.forName(systemType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getCommand(int i) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("resource/config.xml"));
            NodeList nl = doc.getElementsByTagName("commandType");
            Node classNode = null;
            //获取包含图表类型的文本节点
            if(0 == i ) {
                classNode = nl.item(0).getFirstChild();
            }else{
                classNode = nl.item(1).getFirstChild();
            }

            String systemType = classNode.getNodeValue().trim();
            Class c = Class.forName(systemType);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
