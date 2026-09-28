package L2;

import J2.InterfaceC0310g;
import O2.AbstractC0369a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f4716a = new o(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4717b = AbstractC0369a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f4718c = AbstractC0369a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final O2.v f4719d = new O2.v("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final O2.v f4720e = new O2.v("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final O2.v f4721f = new O2.v("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final O2.v f4722g = new O2.v("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final O2.v f4723h = new O2.v("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final O2.v f4724i = new O2.v("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final O2.v f4725j = new O2.v("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final O2.v f4726k = new O2.v("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final O2.v f4727l = new O2.v("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final O2.v f4728m = new O2.v("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final O2.v f4729n = new O2.v("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final O2.v f4730o = new O2.v("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final O2.v f4731p = new O2.v("NO_RECEIVE_RESULT", 0);
    public static final O2.v q = new O2.v("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final O2.v f4732r = new O2.v("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final O2.v f4733s = new O2.v("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0310g interfaceC0310g, Object obj, y2.c cVar) {
        O2.v z3 = interfaceC0310g.z(obj, cVar);
        if (z3 == null) {
            return false;
        }
        interfaceC0310g.E(z3);
        return true;
    }
}
