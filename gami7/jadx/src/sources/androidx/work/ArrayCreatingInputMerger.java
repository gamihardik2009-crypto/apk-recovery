package androidx.work;

import B.F;
import B1.h;
import B1.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends k {
    @Override // B1.k
    public final h a(ArrayList arrayList) {
        Object newInstance;
        F f3 = new F(1);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((h) it.next()).f293a);
            z2.h.e(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(str);
                z2.h.e(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (z2.h.a(cls2, cls)) {
                        z2.h.e(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        z2.h.c(componentType);
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        z2.h.e(newInstance2, "newArray");
                        value = newInstance2;
                        z2.h.e(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    } else {
                        if (!z2.h.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        z2.h.e(newInstance, "newArray");
                        value = newInstance;
                        z2.h.e(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    }
                } else if (cls.isArray()) {
                    z2.h.e(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(cls, 1);
                    Array.set(newInstance, 0, value);
                    z2.h.e(newInstance, "newArray");
                    value = newInstance;
                    z2.h.e(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        f3.C(hashMap);
        h hVar = new h((HashMap) f3.f165i);
        h.b(hVar);
        return hVar;
    }
}
