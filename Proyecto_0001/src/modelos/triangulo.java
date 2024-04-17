package modelos;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;

import jogamp.opengl.*;

public class triangulo {
	private float compVert = 3; 
	private float compColo =4; 
	FloatBuffer bufferVertices ; 
	FloatBuffer bufferColores;
	ByteBuffer bufferIndices;  

	

	
	public void dibujar(GL gl10) {
		
		float[] vertices= {0.0f,0f,
						2.0f,0f,
						1.0f,1.0f}; 
		byte[] indices = {2,1,0}; 
						
		float[] colores= {0.0f,0f,0.0f,1.0f,
						0.0f,0f,0.0f,1.0f,
						0.0f,0f,0.0f,1.0f
						};  
		
		ByteBuffer buffer = ByteBuffer.allocateDirect(vertices.length*4);	
	    bufferVertices = buffer.asFloatBuffer();
	    bufferVertices.put(vertices);
	    bufferVertices.position(0);

	    buffer = ByteBuffer.allocateDirect(colores.length*4);
	    buffer.order(ByteOrder.nativeOrder());
	    bufferColores = buffer.asFloatBuffer();
	    bufferColores.put(colores);
	    bufferColores.position(0);

	    // bufferIndices
	    bufferIndices = ByteBuffer.allocateDirect(indices.length);
	    bufferIndices.order(ByteOrder.nativeOrder());
	    bufferIndices.put(indices);
	    bufferIndices.position(0);
	    
	    
		
	}
	}