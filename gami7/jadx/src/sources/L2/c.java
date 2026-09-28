package L2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends z2.f implements y2.f {

    /* renamed from: p, reason: collision with root package name */
    public static final c f4693p = new c(3, g.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g.f4704k;
        gVar.getClass();
        if (obj3 == i.f4727l) {
            obj3 = new l(gVar.n());
        }
        return new n(obj3);
    }
}
