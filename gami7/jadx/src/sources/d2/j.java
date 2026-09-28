package d2;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class j extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f7519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f7520m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f7521n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f7522o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f7523p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, String str, String str2, String str3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7520m = nVar;
        this.f7521n = str;
        this.f7522o = str2;
        this.f7523p = str3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((j) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new j(this.f7520m, this.f7521n, this.f7522o, this.f7523p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        int i2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i3 = this.f7519l;
        n nVar = this.f7520m;
        if (i3 == 0) {
            y.J(obj);
            List list = (List) nVar.f7534c.f4811h.getValue();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i4 = ((R1.e) it.next()).f5495f;
                while (it.hasNext()) {
                    int i5 = ((R1.e) it.next()).f5495f;
                    if (i4 < i5) {
                        i4 = i5;
                    }
                }
                i2 = i4 + 1;
            }
            int i6 = i2;
            String uuid = UUID.randomUUID().toString();
            z2.h.e(uuid, "toString(...)");
            R1.e eVar = new R1.e(uuid, this.f7521n, this.f7522o, this.f7523p, true, i6);
            this.f7519l = 1;
            if (nVar.f7533b.e(eVar, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.J(obj);
                return C0880v.f8657a;
            }
            y.J(obj);
        }
        p pVar = nVar.f7533b;
        this.f7519l = 2;
        if (pVar.f(this) == enumC1145a) {
            return enumC1145a;
        }
        return C0880v.f8657a;
    }
}
