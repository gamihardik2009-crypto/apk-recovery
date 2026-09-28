package T2;

import B.y;
import D.c0;
import U2.f;
import java.util.Arrays;
import m2.C0870l;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0959k;
import p1.C1058a;
import z2.h;
import z2.t;
import z2.v;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5771a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5772b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0862d f5773c;

    public c(z2.d dVar) {
        this.f5771a = 0;
        this.f5772b = dVar;
        this.f5773c = B2.a.x(EnumC0863e.f8643h, new y(20, this));
    }

    @Override // T2.a
    public final void a(C1058a c1058a, Object obj) {
        switch (this.f5771a) {
            case 0:
                h.f(c1058a, "encoder");
                h.f(obj, "value");
                c1058a.s().getClass();
                F2.b bVar = (F2.b) this.f5772b;
                h.f(bVar, "baseClass");
                z2.d dVar = (z2.d) bVar;
                if (dVar.c(obj)) {
                    v.e(1, null);
                }
                z2.d a3 = t.a(obj.getClass());
                String b3 = a3.b();
                if (b3 == null) {
                    b3 = String.valueOf(a3);
                }
                throw new e("Serializer for subclass '" + b3 + "' is not found " + ("in the polymorphic scope of '" + dVar.b() + '\'') + ".\nCheck if class with serial name '" + b3 + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + b3 + "' has to be '@Serializable', and the base class '" + dVar.b() + "' has to be sealed and '@Serializable'.");
            default:
                Enum r6 = (Enum) obj;
                h.f(c1058a, "encoder");
                h.f(r6, "value");
                Enum[] enumArr = (Enum[]) this.f5772b;
                int x2 = AbstractC0959k.x(enumArr, r6);
                if (x2 != -1) {
                    c1058a.g(b(), x2);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r6);
                sb.append(" is not a valid enum ");
                sb.append(b().b());
                sb.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                h.e(arrays, "toString(...)");
                sb.append(arrays);
                throw new e(sb.toString());
        }
    }

    @Override // T2.a
    public final f b() {
        switch (this.f5771a) {
            case 0:
                return (f) this.f5773c.getValue();
            default:
                return (f) ((C0870l) this.f5773c).getValue();
        }
    }

    public final String toString() {
        switch (this.f5771a) {
            case 0:
                return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + ((F2.b) this.f5772b) + ')';
            default:
                return "kotlinx.serialization.internal.EnumSerializer<" + b().b() + '>';
        }
    }

    public c(String str, Enum[] enumArr) {
        this.f5771a = 1;
        this.f5772b = enumArr;
        this.f5773c = new C0870l(new c0(this, 4, str));
    }
}
