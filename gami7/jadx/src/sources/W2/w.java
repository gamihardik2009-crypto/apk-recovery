package W2;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final U2.f[] f6162a = new U2.f[0];

    /* renamed from: b, reason: collision with root package name */
    public static final T2.a[] f6163b = new T2.a[0];

    public static final C0413n a(String str, T2.a aVar) {
        return new C0413n(str, new C0414o(aVar));
    }

    public static final Set b(U2.f fVar) {
        z2.h.f(fVar, "<this>");
        if (fVar instanceof InterfaceC0404e) {
            return ((InterfaceC0404e) fVar).c();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int f3 = fVar.f();
        for (int i2 = 0; i2 < f3; i2++) {
            hashSet.add(fVar.a(i2));
        }
        return hashSet;
    }

    public static final U2.f[] c(List list) {
        U2.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (U2.f[]) list.toArray(new U2.f[0])) == null) ? f6162a : fVarArr;
    }

    public static final int d(U2.f fVar, U2.f[] fVarArr) {
        z2.h.f(fVar, "<this>");
        z2.h.f(fVarArr, "typeParams");
        int hashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(fVarArr);
        U2.h hVar = new U2.h(fVar, 0);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!hVar.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String b3 = ((U2.f) hVar.next()).b();
            if (b3 != null) {
                i4 = b3.hashCode();
            }
            i3 = i5 + i4;
        }
        U2.h hVar2 = new U2.h(fVar, 0);
        while (hVar2.hasNext()) {
            int i6 = i2 * 31;
            B1.C e3 = ((U2.f) hVar2.next()).e();
            i2 = i6 + (e3 != null ? e3.hashCode() : 0);
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }

    public static final T2.a e(Object obj, T2.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = T2.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof T2.a) {
                return (T2.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                throw e3;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e3.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }
}
