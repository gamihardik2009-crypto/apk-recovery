package s2;

import C1.y;
import K1.m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1196a implements InterfaceC1073d, InterfaceC1199d, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1073d f10203h;

    public AbstractC1196a(InterfaceC1073d interfaceC1073d) {
        this.f10203h = interfaceC1073d;
    }

    public InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f10203h;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    public InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        z2.h.f(interfaceC1073d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement o() {
        int i2;
        String str;
        InterfaceC1200e interfaceC1200e = (InterfaceC1200e) getClass().getAnnotation(InterfaceC1200e.class);
        String str2 = null;
        if (interfaceC1200e == null) {
            return null;
        }
        int v3 = interfaceC1200e.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? interfaceC1200e.l()[i2] : -1;
        m mVar = AbstractC1201f.f10208b;
        m mVar2 = AbstractC1201f.f10207a;
        if (mVar == null) {
            try {
                m mVar3 = new m(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC1201f.f10208b = mVar3;
                mVar = mVar3;
            } catch (Exception unused2) {
                AbstractC1201f.f10208b = mVar2;
                mVar = mVar2;
            }
        }
        if (mVar != mVar2) {
            Method method = (Method) mVar.f4558a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = (Method) mVar.f4559b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = (Method) mVar.f4560c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = interfaceC1200e.c();
        } else {
            str = str2 + '/' + interfaceC1200e.c();
        }
        return new StackTraceElement(str, interfaceC1200e.m(), interfaceC1200e.f(), i3);
    }

    public abstract Object p(Object obj);

    public void q() {
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        InterfaceC1073d interfaceC1073d = this;
        while (true) {
            AbstractC1196a abstractC1196a = (AbstractC1196a) interfaceC1073d;
            InterfaceC1073d interfaceC1073d2 = abstractC1196a.f10203h;
            z2.h.c(interfaceC1073d2);
            try {
                obj = abstractC1196a.p(obj);
                if (obj == EnumC1145a.f10026h) {
                    return;
                }
            } catch (Throwable th) {
                obj = y.n(th);
            }
            abstractC1196a.q();
            if (!(interfaceC1073d2 instanceof AbstractC1196a)) {
                interfaceC1073d2.t(obj);
                return;
            }
            interfaceC1073d = interfaceC1073d2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object o3 = o();
        if (o3 == null) {
            o3 = getClass().getName();
        }
        sb.append(o3);
        return sb.toString();
    }
}
