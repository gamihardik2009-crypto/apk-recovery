package Q2;

import J2.B;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f5352j;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f5352j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5352j.run();
        } finally {
            this.f5350i.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5352j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(B.j(runnable));
        sb.append(", ");
        sb.append(this.f5349h);
        sb.append(", ");
        sb.append(this.f5350i);
        sb.append(']');
        return sb.toString();
    }
}
