package V;

/* loaded from: classes.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5870a = 0;

    boolean c(y2.c cVar);

    Object e(Object obj, y2.e eVar);

    default o k(o oVar) {
        return oVar == l.f5857b ? this : new i(this, oVar);
    }
}
