package m;

/* loaded from: classes.dex */
public interface z0 {
    boolean a();

    long b(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3);

    AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3);

    AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3);

    default AbstractC0845s k(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        return e(b(abstractC0845s, abstractC0845s2, abstractC0845s3), abstractC0845s, abstractC0845s2, abstractC0845s3);
    }
}
