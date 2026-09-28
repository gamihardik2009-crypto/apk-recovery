package V;

/* loaded from: classes.dex */
public final class h extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final h f5852i = new h(2);

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        String str = (String) obj;
        m mVar = (m) obj2;
        if (str.length() == 0) {
            return mVar.toString();
        }
        return str + ", " + mVar;
    }
}
