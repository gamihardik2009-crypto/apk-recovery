package o1;

import J.InterfaceC0258c0;
import J.W0;
import java.util.List;
import java.util.Map;
import l.C0790E;
import l.C0791F;
import l.C0805n;
import l.C0811u;
import l.S;
import n1.C0945f;
import n2.AbstractC0960l;

/* loaded from: classes.dex */
public final class w extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map f9299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f9300j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f9301k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f9302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f9303m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f9304n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f9305o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map map, i iVar, y2.c cVar, y2.c cVar2, y2.c cVar3, W0 w02, InterfaceC0258c0 interfaceC0258c0) {
        super(1);
        this.f9299i = map;
        this.f9300j = iVar;
        this.f9301k = cVar;
        this.f9302l = cVar2;
        this.f9303m = cVar3;
        this.f9304n = w02;
        this.f9305o = interfaceC0258c0;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        float f3;
        C0805n c0805n = (C0805n) obj;
        if (!((List) this.f9304n.getValue()).contains(c0805n.b())) {
            return B2.a.H(C0790E.f8127b, C0791F.f8129b);
        }
        String str = ((C0945f) c0805n.b()).f9032m;
        Map map = this.f9299i;
        Float f4 = (Float) map.get(str);
        if (f4 != null) {
            f3 = f4.floatValue();
        } else {
            map.put(((C0945f) c0805n.b()).f9032m, Float.valueOf(0.0f));
            f3 = 0.0f;
        }
        if (!z2.h.a(((C0945f) c0805n.c()).f9032m, ((C0945f) c0805n.b()).f9032m)) {
            f3 = (((Boolean) this.f9300j.f9243c.getValue()).booleanValue() || AbstractC0960l.e(this.f9305o)) ? f3 - 1.0f : f3 + 1.0f;
        }
        map.put(((C0945f) c0805n.c()).f9032m, Float.valueOf(f3));
        return new C0811u((C0790E) this.f9301k.l(c0805n), (C0791F) this.f9302l.l(c0805n), f3, (S) this.f9303m.l(c0805n));
    }
}
